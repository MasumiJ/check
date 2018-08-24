package market.dataanalysistool.web;

import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import market.dataanalysistool.ejb.PeriodOfTime;
import market.dataanalysistool.ejb.StockStdAndPoorSessionBeanLocal;
import market.dataanalysistool.ejb.StockStdAndPoorSessionBeanRemote;
import market.dataanalysistool.jpa.Market;
import market.dataanalysistool.jpa.MarketPK;

@RequestScoped
@Path("/stdandpoor")
@Produces({ "application/xml", "application/json" })
@Consumes({ "application/xml", "application/json" })
public class StdAndPoorResource {
	
	StockStdAndPoorSessionBeanRemote bean;
	Context context;
	
	public StdAndPoorResource() {
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
	public List<Market> getAllProducts(@QueryParam("filter") @DefaultValue("") String filter) {
		return bean.getAllStocks();
	}
}
