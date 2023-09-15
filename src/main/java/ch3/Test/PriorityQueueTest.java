package ch3.Test;

import ch3.DelayQueue;
import ch3.Delayed;
import ch3.PriorityQueue;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class PriorityQueueTest {
    private final Logger logger = LoggerFactory.getLogger(PriorityQueueTest.class);
    @Test
    public void test(){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        priorityQueue.add(6);
        priorityQueue.add(7);
        priorityQueue.add(8);

        Integer peek = priorityQueue.peek();
        System.out.println(peek);
    }

    @Test
    public void delayTest() throws Exception {
        DelayQueue<Job> queue = new DelayQueue<>();

        queue.add(new Job("1号", 1000L));
        queue.add(new Job("3号", 3000L));
        queue.add(new Job("5号", 5000L));
        queue.add(new Job("11号", 11000L));
        queue.add(new Job("4号", 4000L));
        queue.add(new Job("6号", 6000L));
        queue.add(new Job("7号", 7000L));
        queue.add(new Job("12号", 12000L));
        queue.add(new Job("15号", 15000L));
        queue.add(new Job("10号", 10000L));
        queue.add(new Job("9号", 9000L));
        queue.add(new Job("8号", 8000L));

        while (true) {
            Job poll = queue.poll();
            if (null == poll) {
                Thread.sleep(10);
                continue;
            }
            logger.info(poll.getName());
        }
    }

    static class Job implements Delayed {

        private final String name;
        private final Long begin;
        private final Long delayTime;

        public Job(String name, Long delayTime) {
            this.name = name;
            this.begin = System.currentTimeMillis();
            this.delayTime = delayTime;//延时时长
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(begin + delayTime - System.currentTimeMillis(), TimeUnit.MICROSECONDS);
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Delayed o) {
            Job job = (Job) o;
            return (int) (this.getDelay(TimeUnit.MICROSECONDS) - job.getDelay(TimeUnit.MICROSECONDS));
        }
    }
}
