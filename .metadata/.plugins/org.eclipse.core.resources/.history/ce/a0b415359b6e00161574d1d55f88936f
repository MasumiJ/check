package market.dataanalysistool.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stocklist database table.
 * 
 */
@Entity
@NamedQuery(name="Stocklist.findAll", query="SELECT s FROM Stocklist s")
public class Stocklist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stock_name")
	private String stockName;

	private String type;

	public Stocklist() {
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}