import com.sapient.entity.SmartCard;
import com.sapient.entity.Station;
import com.sapient.entity.Traveller;
import com.sapient.exception.TravellerWithNoSmartCardException;
import com.sapient.exception.MetroSystemException;
import com.sapient.service.MetroCardService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ApplicationTest {
	private MetroCardService metroCardService;
	
	private SmartCard smartCard;
	
	private Traveller traveller = new Traveller(1,"Jas");
	
	@Before
	public void setUp() throws Exception {
		smartCard = new SmartCard();
		smartCard.setId(1);
		smartCard.setBalance(100);
		smartCard.setTraveller(new Traveller(1, "Jasleen"));
	}
	
	@Test
	public void testCalculateFootFallForStation() throws Exception {
		metroCardService.swipeIn(smartCard, Station.A1, LocalDateTime.of(2016, Month.APRIL, 8, 18, 25));
		metroCardService.swipeOut(smartCard, Station.A6, LocalDateTime.of(2016, Month.APRIL, 8, 18, 35));
		
		metroCardService.swipeIn(smartCard, Station.A6, LocalDateTime.of(2016, Month.APRIL, 10, 19, 05));
		metroCardService.swipeOut(smartCard, Station.A10, LocalDateTime.of(2016, Month.APRIL, 10, 19, 15));
		
		assertThat("FootFall for station A6 should be 2", metroCardService.calculateFootFall(Station.A6), equalTo(2));
	}
	
	@Test(expected = TravellerWithNoSmartCardException.class)
	public void testTravellerWithNoSmartCardException() throws TravellerWithNoSmartCardException {
		traveller.setSmartCard(null);
		Assert.assertEquals(new TravellerWithNoSmartCardException("Traveller does not have smart card"), TravellerWithNoSmartCardException.validate(traveller));
	}
}
