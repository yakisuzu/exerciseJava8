package bean;

import java.util.List;

public class SampleBean {
	private int id;
	private String name;
	private List<SampleBeanChild> sampleBeanChildList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<SampleBeanChild> getSampleBeanChildList() {
		return sampleBeanChildList;
	}

	public void setSampleBeanChildList(List<SampleBeanChild> sampleBeanChildList) {
		this.sampleBeanChildList = sampleBeanChildList;
	}
}
