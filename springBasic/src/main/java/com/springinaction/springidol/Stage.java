package com.springinaction.springidol;

/**
 * 舞台
 * 单例类
 * @author xjp
 *
 */
public class Stage {

	private Stage() {
		super();
	}
	
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;
	}

}
