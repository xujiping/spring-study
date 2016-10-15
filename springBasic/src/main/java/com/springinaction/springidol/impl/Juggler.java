package com.springinaction.springidol.impl;

import com.springinaction.springidol.Performer;
import com.springinaction.springidol.common.PerformanceException;

/**
 * 杂技师
 * 
 * @author xjp
 *
 */
public class Juggler implements Performer {

	private int beanBags = 3;

	public Juggler() {
		super();
	}

	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
	}

	public void perform() throws PerformanceException {
		System.out.println("juggling " + beanBags + " beanbags");
	}

}
