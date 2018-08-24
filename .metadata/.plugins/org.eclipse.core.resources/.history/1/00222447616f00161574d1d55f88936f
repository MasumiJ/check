package market.dataanalysistool.web;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import market.dataanalysistool.ejb.PeriodOfTime;
import market.dataanalysistool.ejb.StockStdAndPoorSessionBeanRemote;
import market.dataanalysistool.jpa.DataPoint;
import market.dataanalysistool.jpa.ListOfTickers;
import market.dataanalysistool.jpa.StockInfo;
//import market.dataanalysistool.jpa.CloseValueAndDate;
//import market.dataanalysistool.jpa.Market;
import market.dataanalysistool.jpa.TickerCloseValues;
import market.dataanalysistool.jpa.TypeAndSumOfVolume;

@RequestScoped
@Path("/FirstFunction")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class FirstFunction {
	
	StockStdAndPoorSessionBeanRemote bean;
	Context context;

	
	public FirstFunction() {
		try {
			context = new InitialContext();
			bean = (StockStdAndPoorSessionBeanRemote)context.lookup("java:app/MarketDataAnalysisToolEJB/StockStdAndPoorSessionBean!market.dataanalysistool.ejb.StockStdAndPoorSessionBeanRemote");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces("application/json")
	public void Blah() {
//		System.out.println(tickerName);
//		return bean.getPriceTrendByTime(tickerName,timePeriod);
	}
	
	@GET
	@Path("/{tickerName}/{startDate}/{endDate}")
	@Produces("application/json")
	public TickerCloseValues getAllProducts(@PathParam("tickerName") String tickerName,@PathParam("startDate") String startDate,@PathParam("endDate") String endDate,@QueryParam("filter") @DefaultValue("") String filter) {
		System.out.println(startDate);
		System.out.println(endDate);
		//System.out.println(tickerName);
		return bean.getPriceTrendByTime(tickerName,startDate,endDate);
	}
	
	@GET
	@Path("/simpleAvg/{ticker}/{startDate}/{endDate}")
	@Produces("application/json")
	public List<DataPoint> getSimpleMovingAverages(@PathParam("ticker") String tickerName,@PathParam("startDate") String startDate,@PathParam("endDate") String endDate) {
		return bean.getSimpleMovingAverages(tickerName, startDate,endDate);
//		return "returned test";
	}
	
	@GET
	@Path("/expAvg/{ticker}/{startDate}/{endDate}")
	@Produces("application/json")
	public List<DataPoint> getExponentialMovingAverages(@PathParam("ticker") String tickerName,@PathParam("startDate") String startDate,@PathParam("endDate") String endDate) {
		return bean.getExponentialMovingAverages(tickerName, startDate,endDate);
//		return "returned test";
	}
	
	@GET
	@Path("/devFromAvg")
	@Produces("application/json")
	public List<DataPoint> getDeviationFromMovingAverages() {
		//return bean.getDeviationFromMovingAverages("A", 10, PeriodOfTime.YEAR,0);
//		return "returned test";
		return null;
	}
	
	@GET
	@Path("/allTickers")
	@Produces("application/json") 
	public List<String> getAllTickers(@QueryParam("filter") @DefaultValue("") String filter) {
		return bean.getAllTickers();
	}
	
	@GET
	@Path("/volume/{timePeriod}")
	@Produces("application/json") 
	public List<TypeAndSumOfVolume> volumeTrendByCategory(@PathParam("timePeriod") String timePeriod,@QueryParam("filter") @DefaultValue("") String filter) {
		return bean.volumeTrendByCategory(timePeriod);
	}
	
	@GET
	@Path("/stockInfo/{ticker}")
	@Produces("application/json") 
	public StockInfo getStockInfo(@PathParam("ticker") String ticker,@QueryParam("filter") @DefaultValue("") String filter) {
		return bean.getStockInfo(ticker);
	}
}
