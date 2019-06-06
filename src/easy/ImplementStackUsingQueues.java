package easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author GK
 * @version 创建时间：2019-6-6 下午1:49:48
 * @ClassName 类名称
 * @Description 类描述
 */
public class ImplementStackUsingQueues extends LeetcodeEasyLevel {

	public static void main(String[] args) {

	}

	public class MyStack {
		Queue<Integer> queue1;
		Queue<Integer> queue2;

		public MyStack() {
			queue1 = new LinkedList<>();
			queue2 = new LinkedList<>();
		}

		public void push(int x) {
			queue1.offer(x);
		}

		public int pop() {
			while (!queue1.isEmpty()) {
				int temp = queue1.poll();
				if (queue1.isEmpty()) {
					while (!queue2.isEmpty()) {
						queue1.offer(queue2.poll());
					}
					return temp;
				} else {
					queue2.offer(temp);
				}
			}
			return 0;
		}

		public int top() {
			while (!queue1.isEmpty()) {
				int temp = queue1.poll();
				if (queue1.isEmpty()) {
					queue2.offer(temp);
					while (!queue2.isEmpty()) {
						queue1.offer(queue2.poll());
					}
					return temp;
				} else {
					queue2.offer(temp);
				}
			}
			return 0;
		}

		public boolean empty() {
			return queue1.isEmpty();
		}
	}
}
