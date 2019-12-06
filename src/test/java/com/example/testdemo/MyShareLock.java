package com.example.testdemo;


import java.io.Serializable;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class MyShareLock implements Serializable {

    private final Sync sync;
    private final int maxCount;

    public MyShareLock(int count) {
        this.sync=new Sync(count);
        maxCount=count;
    }

    public boolean lock(){
        return sync.acquireByShared(1);
    }

    public boolean unlock(){
        return sync.tryReleaseShared(1);
    }

    class Sync extends AbstractQueuedSynchronizer{
        public Sync(int count) {
            setState(count);
        }

        //获得i个锁
        protected boolean acquireByShared(int i){
            //自旋保证cas一定成功
            for (;;){
                if (i<=0)
                    return false;

                int state=getState();

                if(state<=0)
                    return false;

                int expectState=state-i;

                if (expectState<0)
                    return false;

                //cas if fail contineFor
                if(compareAndSetState(state,expectState))
                    return true;
            }
        }

        //释放i个锁
        protected  boolean tryReleaseShared(int i){
            for (;;){
                if (i<=0)
                    return false;

                int state=getState();
                int expectState=state+i;

                //超过int的最大值，或者expectstate超过我们的最大预期

                if (expectState<0||expectState>maxCount){
                    return false;
                }
                if (compareAndSetState(state,expectState)){
                    return true;
                }
            }
        }

    }
}

