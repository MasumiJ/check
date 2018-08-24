package market.dataanalysistool.jpa;

import java.io.Serializable;

public class TypeAndSumOfVolume implements Serializable{
	private String type_;
	private long volume;
	public String getType_() {
		return type_;
	}
	public void setType_(String type_) {
		this.type_ = type_;
	}
	public long getVolume() {
		return volume;
	}
	public void setVolume(long volume) {
		this.volume = volume;
	}
	
	
}
