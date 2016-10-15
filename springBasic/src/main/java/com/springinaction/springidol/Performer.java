package com.springinaction.springidol;

import com.springinaction.springidol.common.PerformanceException;

/**
 * 参赛者
 * @author xjp
 *
 */
public interface Performer {
	
	void perform() throws PerformanceException;

}
