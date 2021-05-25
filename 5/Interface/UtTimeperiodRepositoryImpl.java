import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
public class UtTimeperiodRepositoryImpl implements UtTimeperiodRepository{

 private RestTemplate restTemplate;

  String url = "http://1";


public UtTimeperiod findByStartDateAndEndDateAndPeriodicity(Date startDate,Date endDate,String string){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findByStartDateAndEndDateAndPeriodicity"))
    .queryParam("startDate",startDate)
    .queryParam("endDate",endDate)
    .queryParam("string",string);
  UtTimeperiod aux = restTemplate.getForObject(builder.toUriString(), UtTimeperiod.class)

 return aux;
}


public UtTimeperiod save(UtTimeperiod timeperiod){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/save"))
    .queryParam("timeperiod",timeperiod);
  UtTimeperiod aux = restTemplate.getForObject(builder.toUriString(), UtTimeperiod.class)

 return aux;
}


public List<UtTimeperiod> findByPeriodicity(String string){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findByPeriodicity"))
    .queryParam("string",string);
  List<UtTimeperiod> aux = restTemplate.getForObject(builder.toUriString(), List<UtTimeperiod>.class)

 return aux;
}


}