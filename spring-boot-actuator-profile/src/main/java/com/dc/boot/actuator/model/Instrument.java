package com.dc.boot.actuator.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Instrument {
	
	private String methodName;
	private AtomicLong count;
	private AtomicLong min;
	private AtomicLong max;
	private AtomicLong totalTime;
	private List<Long> timeStore = new ArrayList<>();
	private AtomicLong average;
	private AtomicLong median;
	private AtomicLong standardDeviation;
	
	public AtomicLong getCount() {
		return count;
	}
	public void setCount(AtomicLong count) {
		this.count = count;
	}
	public AtomicLong getMin() {
		return min;
	}
	public void setMin(AtomicLong min) {
		this.min = min;
	}
	public AtomicLong getMax() {
		return max;
	}
	public void setMax(AtomicLong max) {
		this.max = max;
	}
	public AtomicLong getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(AtomicLong totalTime) {
		this.totalTime = totalTime;
	}
	public List<Long> getTimeStore() {
		return timeStore;
	}
	public void setTimeStore(List<Long> timeStore) {
		this.timeStore = timeStore;
	}
	public AtomicLong getAverage() {
		return average;
	}
	public void setAverage(AtomicLong average) {
		this.average = average;
	}
	public AtomicLong getMedian() {
		return median;
	}
	public void setMedian(AtomicLong median) {
		this.median = median;
	}
	public AtomicLong getStandardDeviation() {
		return standardDeviation;
	}
	public void setStandardDeviation(AtomicLong standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	
}
