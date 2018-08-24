package market.dataanalysistool.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the final_data database table.
 * 
 */
@Entity
@Table(name="final_data")
@NamedQuery(name="Market.findAll", query="SELECT m FROM Market m")
public class Market implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MarketPK id;

	private double close_;
	
	@Column(name="difference")
	private double difference;

	private double high_;

	private double low_;

	private double open_;

	@Column(name="risk_")
	private double risk;

	private String type_;

	private int volume;

	public Market() {
	}

	public MarketPK getId() {
		return this.id;
	}

	public void setId(MarketPK id) {
		this.id = id;
	}

	public double getClose_() {
		return this.close_;
	}

	public void setClose_(double close_) {
		this.close_ = close_;
	}

	public double getDifference() {
		return this.difference;
	}

	public void setDifference(double difference) {
		this.difference = difference;
	}

	public double getHigh_() {
		return this.high_;
	}

	public void setHigh_(double high_) {
		this.high_ = high_;
	}

	public double getLow_() {
		return this.low_;
	}

	public void setLow_(double low_) {
		this.low_ = low_;
	}

	public double getOpen_() {
		return this.open_;
	}

	public void setOpen_(double open_) {
		this.open_ = open_;
	}

	public double getRisk() {
		return this.risk;
	}

	public void setRisk(double risk) {
		this.risk = risk;
	}

	public String getType_() {
		return this.type_;
	}

	public void setType_(String type_) {
		this.type_ = type_;
	}

	public int getVolume() {
		return this.volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}