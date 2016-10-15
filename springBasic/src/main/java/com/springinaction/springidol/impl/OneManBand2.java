package com.springinaction.springidol.impl;

import java.util.Map;

import com.springinaction.springidol.Instrument;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.common.PerformanceException;

public class OneManBand2 implements Performer {
	
	private Map<String, Instrument> instruments;
	
	private OneManBand2() {
		super();
	}
	
	public Map<String, Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}

	@Override
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

}
