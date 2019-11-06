package lock;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class AQSTest {

    private class Sync extends AbstractQueuedSynchronizer{


        @Override
        protected boolean tryAcquire(int arg){
            if (getExclusiveOwnerThread() == Thread.currentThread()) {
            return true;
            }
            if (compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }else {
                return false;
            }
        }

        @Override
        protected boolean tryRelease(int arg) {
            setState(0);
            setExclusiveOwnerThread(null);
            return true;
        }
    }

    private Sync mSync;

    public AQSTest(){
        mSync = new Sync();
    }

    public void lock(){
        mSync.acquire(1);
    }

    public void unLock(){
        mSync.release(1);
    }
}
