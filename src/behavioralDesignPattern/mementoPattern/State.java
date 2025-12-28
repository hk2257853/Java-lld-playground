package behavioralDesignPattern.mementoPattern;

public class State {
	private Integer page;
	private String time;

	public State(Integer page, String time) {
		this.page = page;
		this.time = time;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
