package ar.edu.unlp.info.oo1.ejercicio10;

import java.util.List;

public class LifoStrategy extends Strategy{

	
	
	public JobDescription getNext(List<JobDescription> jobs) {
		return jobs.get(jobs.size()-1);
	}
}
