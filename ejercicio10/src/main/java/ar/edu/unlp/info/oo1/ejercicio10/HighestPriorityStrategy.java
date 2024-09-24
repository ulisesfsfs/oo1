package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;

public class HighestPriorityStrategy extends Strategy{

	
	
	public JobDescription getNext(List<JobDescription> jobs) {
		return jobs.stream()
                .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                .orElse(null);
	}
}
