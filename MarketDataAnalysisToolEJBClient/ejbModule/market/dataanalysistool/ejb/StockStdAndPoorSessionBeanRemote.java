package market.dataanalysistool.ejb;

import java.util.List;

import javax.ejb.Remote;

import org.apache.activemq.artemis.utils.json.JSONException;
import org.apache.activemq.artemis.utils.json.JSONObject;

import market.dataanalysistool.jpa.CloseValueAndDate;
import market.dataanalysistool.jpa.DataPoint;
import market.dataanalysistool.jpa.ListOfTickers;
import market.dataanalysistool.jpa.Market;
import market.dataanalysistool.jpa.StockInfo;
import market.dataanalysistool.jpa.TickerCloseValues;
import market.dataanalysistool.jpa.TypeAndSumOfVolume;

@Remote
public interface StockStdAndPoorSessionBeanRemote {
	public List<DataPoint> getSimpleMovingAverages(String ticker,String startDate, String startEnd);
	public List<DataPoint> getExponentialMovingAverages(String ticker,String startDate, String endDate);
	public TickerCloseValues getPriceTrendByTime(String ticker, String startEnd, String endDate);
	public List<Market> getVolumeTrendByTime(String ticker, PeriodOfTime timePeriod);
	public List<Market> getAllStocks();
	public List<String> getAllTickers();
	public List<DataPoint> getDeviationFromMovingAverages(String ticker, String startDate, String endDate, int averageFlag);
	public List<TypeAndSumOfVolume> volumeTrendByCategory(String timePeriod);
	public StockInfo getStockInfo(String ticker);
}
