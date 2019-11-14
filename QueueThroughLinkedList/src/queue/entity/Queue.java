package queue.entity;

import java.util.*;

public class Queue {

		private LinkedList<String> list;
		private int currentIndex;
		
		public Queue(LinkedList<String> list, int currentIndex) {
			super();
			this.list = list;
			this.currentIndex = -1;
		}
		
		public Queue() {
			list=new LinkedList<>();
			this.currentIndex=-1;
		}

		/**
		 * @return the list
		 */
		public LinkedList<String> getList() {
			return list;
		}
		/**
		 * @param list the list to set
		 */
		public void setList(LinkedList<String> list) {
			this.list = list;
		}
		/**
		 * @return the currentIndex
		 */
		public int getCurrentIndex() {
			return currentIndex;
		}
		/**
		 * @param currentIndex the currentIndex to set
		 */
		public void setCurrentIndex(int currentIndex) {
			this.currentIndex = currentIndex;
		}
			
		
		
	}


