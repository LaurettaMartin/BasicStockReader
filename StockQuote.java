import java.util.Scanner;


	public class StockQuote {
	    public static void main (String[] args) {

		  Scanner scanner = new Scanner(System.in);  
		  	 System.out.println("Please provide the ticker symbol of the stock you are viewing.");
			   	 String Ticker = scanner.nextLine();
	         System.out.println("Please enter the bid of the stock you are viewing.");
	              double Bid = scanner.nextDouble();
	         System.out.println("Please enter the market cap of the stock you are viewing.");
	              double MarketCap = scanner.nextDouble();
	         System.out.println("Please enter the beta of the stock you are viewing.");
	              double Beta = scanner.nextDouble();
	         System.out.println("Please enter the earnings per share of the stock you are viewing.");
	              double EPS = scanner.nextDouble();
	         System.out.println("Please enter the net income of the company you are viewing.");
	              double NetIncome = scanner.nextDouble();
	         System.out.println("Please enter the interest of the company you are viewing.");
	              double Interest = scanner.nextDouble();
	         System.out.println("Please enter the taxes of the company you are viewing.");
	              double Taxes = scanner.nextDouble();
	         System.out.println("Please enter the depreciation of the company you are viewing.");
	              double Depreciation = scanner.nextDouble();
	         System.out.println("Please enter the amortization of the company you are viewing.");
	              double Amortization = scanner.nextDouble();
	         System.out.println("Please enter the net debt of the company you are viewing.");
	              double NetDebt = scanner.nextDouble();
	         System.out.println("Please enter the cash and equivalents of the company you are viewing.");
	              double CashAndEquivalents = scanner.nextDouble();

			System.out.println(" ");
			System.out.println("SUMMARY:");
			System.out.println(" ");
			System.out.println("The ticker symbol is: " +Ticker);
			System.out.println("The bid is: " +Bid);
			System.out.println("The market cap is: "+MarketCap);
			System.out.println("The beta is: "+Beta);
			System.out.println("The earnings per share is: "+EPS);
			System.out.println("The net income is: "+NetIncome);
			System.out.println("The interest is: "+Interest);
			System.out.println("The taxes ar: "+Taxes);
			System.out.println("The depreciation is: "+Depreciation);
			System.out.println("The amortization is: "+Amortization);
			System.out.println("The NetDebt is: "+NetDebt);
			System.out.println("The cash and equivalents is: "+CashAndEquivalents);
			System.out.println(" ");

	        double PEratio = 0;
	        double EBITDA = 0;
	        double EnterpriseValue = 0;
	        double EvEBITDA = 0;

	            PEratio = Bid/EPS;
	            EBITDA = Interest + Taxes + Depreciation + Amortization;
	            EnterpriseValue = MarketCap + NetDebt - CashAndEquivalents;
	            EvEBITDA = EnterpriseValue/EBITDA;
	        
				System.out.println(" ");
				System.out.println("CALCULATIONS MADE:");
				System.out.println(" ");
	            System.out.println("The price to earnings ratio is "+PEratio);
				System.out.println(" ");
	            System.out.println("The EBIDTA is "+EBITDA);
				System.out.println(" ");
	            System.out.println("The enterprise value is "+EnterpriseValue);
				System.out.println(" ");
	            System.out.println("The EV/EBITDA is "+EvEBITDA);
				System.out.println(" ");

	        if(Beta >= 1.5){
				System.out.println(" ");
	            System.out.println("There is high correlation with the market AND high volatility, indicating that "+Ticker+" is a riskier stock.");
			}
			else if(Beta < 1.5 && Beta >= 1){	
				System.out.println(" ");
				System.out.println("There is high correlation with the market but a similar volatility, indicating that "+Ticker+" is an ideal stock risk-wise.");
			}
	        else if(Beta < 1 && Beta > 0){
				System.out.println(" ");
	            System.out.println("There is high correlation with the market AND a similar volatility to the market, indicating that "+Ticker+" is a less risky stock.");
	        }
	        else if(Beta == 0){
				System.out.println(" ");
	            System.out.println("There is no true correlation between "+Ticker+" and the market.");
	        }
	        else if(Beta < 0 && Beta >= 1){
				 System.out.println(" ");
	             System.out.println("There is an inverese correlation between the market and "+Ticker+", but lower risk associated with "+Ticker+".");
	        }
	        else if(Beta <= -1){
				 System.out.println(" ");
	             System.out.println("There is a strong inverse correlation with the market AND high volatility, indicatring that "+Ticker+" is a riskier stock.");
	        }
	        
	    
	        if(PEratio <= 25 && PEratio >= 20){
				System.out.println(" ");
	            System.out.println(Ticker+" is in the range of the average P/E ratio.");
	        }
	       	else if(PEratio > 25){
				System.out.println(" ");
	            System.out.println(Ticker+" has a P/E ratio that is too large to be considered good. This indicates that you are paying much more for each share.");
	        }
	        else if (PEratio < 20){
				System.out.println(" ");
	            System.out.println(Ticker+" has a low P/E ratio, indicating that it is good for buyers.");
	        }
	    
	    
	    if(EvEBITDA <= 10){
				System.out.println(" ");
	            System.out.println(Ticker+" has a good EV/EBITDTA ratio. This indicates that "+Ticker+" is potentially undervalued.");
	        }
	        else if(EvEBITDA > 10){
				System.out.println(" ");
	            System.out.println(Ticker+" is potentially overpriced. This indicates that "+Ticker+" may be overvalued.");
	        }
	    
		if(EPS >=13){	System.out.println(" ");
				System.out.println(Ticker+" trades at "+EPS+" times earnings. This is above the S&P average which ranges from 13 to 15. This indicates that "+Ticker+" may be a good buy.");
			}
	    	else if(EPS <13){
				System.out.println(" ");
				System.out.println(Ticker+" trades at "+EPS+" times earnings. This is less than the S&P average which ranges from 13 to 15. 
				This indicates that "+Ticker+" may not be a good buy since you will recieve less earnings per share.");
			}
		
        if(EvEBITDA <= 10 && PEratio <20 && Beta <= 1.5 && Beta > 0 && EPS>=13){
			System.out.println(" ");
			System.out.println("CONCLUSION:");
            System.out.println("After taking into account EV/EBITDA, Price to Earnings Ratio, Beta, and Earning per Share, "+Ticker+" 
			appears to be a really good buy as determined from its beta, P/E ratio, and EV/EBITDA.");
        }
		else if(EvEBITDA <= 10 || PEratio <20 || Beta <= 1.5 && Beta > 0 || EPS>=13){
			System.out.println(" ");
			System.out.println("CONCLUSION:");
            System.out.println("After taking into account EV/EBITDA, Price to Earnings Ratio, Beta, and Earning per Share, "+Ticker+" 
			needs to be examined through current events to see if this is a good purchase. 
			It appears that "+Ticker+" has a good beta, P/E ratio, or EV/EBITDA.");
        }
        else{
			System.out.println(" ");
			System.out.println("CONCLUSION:");
            System.out.println("After taking into account EV/EBITDA, Price to Earnings Ratio, Beta, and Earning per Share, "+Ticker+" 
			does not appear to be a good buy. It is necessary to review current events 
			about the stock to determine if it will be a good investment or not.");
        }

	}
}