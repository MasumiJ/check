package market.dataanalysistool.ejb;

import java.util.List;
import javax.ejb.Local;

import org.apache.activemq.artemis.utils.json.JSONObject;

import market.dataanalysistool.jpa.CloseValueAndDate;
import market.dataanalysistool.jpa.DataPoint;
import market.dataanalysistool.jpa.ListOfTickers;
import market.dataanalysistool.jpa.Market;
import market.dataanalysistool.jpa.MarketPK;
import market.dataanalysistool.jpa.StockInfo;
import market.dataanalysistool.jpa.TickerCloseValues;
import market.dataanalysistool.jpa.TypeAndSumOfVolume;
/*
 * This interface details the list of methods that can be implemented on the database of the S&P 500
 */
@Local
public interface StockStdAndPoorSessionBeanLocal {
	public List<DataPoint> getSimpleMovingAverages(String ticker,String startDate, String startEnd);
	public List<DataPoint> getExponentialMovingAverages(String ticker, String startDate, String endDate);
	public TickerCloseValues getPriceTrendByTime(String ticker, String startDate, String endDate);
	public List<Market> getVolumeTrendByTime(String ticker, PeriodOfTime timePeriod);
	public List<String> getAllTickers();
	public List<Market> getAllStocks();
	List<DataPoint> getDeviationFromMovingAverages(String ticker, String startDate, String endDate, int averageFlag);
	public List<TypeAndSumOfVolume> volumeTrendByCategory(String timePeriod);
	public StockInfo getStockInfo(String ticker);

}
