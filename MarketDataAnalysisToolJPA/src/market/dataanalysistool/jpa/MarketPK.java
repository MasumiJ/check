package market.dataanalysistool.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the final_data database table.
 * 
 */
@Embeddable
public class MarketPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ticker_")
	private String ticker_;

	@Temporal(TemporalType.DATE)
	private java.util.Date x_Date;

	public MarketPK() {
	}
	public String getTicker_() {
		return this.ticker_;
	}
	public void setTicker_(String ticker_) {
		this.ticker_ = ticker_;
	}
	public java.util.Date getX_Date() {
		return this.x_Date;
	}
	public void setX_Date(java.util.Date x_Date) {
		this.x_Date = x_Date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MarketPK)) {
			return false;
		}
		MarketPK castOther = (MarketPK)other;
		return 
			this.ticker_.equals(castOther.ticker_)
			&& this.x_Date.equals(castOther.x_Date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ticker_.hashCode();
		hash = hash * prime + this.x_Date.hashCode();
		
		return hash;
	}
}