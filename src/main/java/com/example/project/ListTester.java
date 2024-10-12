package com.example.project;

public class ListTester {
	 public static <T> void circularLeftShift(List <T> list, int n)
	    {
	    	list.findFirst();
	    	if(list.last())
	    		return;
	    	for(int i = 0 ; i < n ; i++) {
	    		list.findFirst();
	    		T tmp = list.retrieve();
	    		list.remove();
	    		while(!list.last())
	    			list.findNext();
	    		list.insert(tmp);
	    	}


	    }
	    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
	    {
	    	if(!l1.empty())
	    		return;
	    	while(!l1.first()) {
	    		l2.insert(l1.retrieve());
	    		l1.findPrevious();
	    	}
	    	l2.insert(l1.retrieve());

	    }
	}
