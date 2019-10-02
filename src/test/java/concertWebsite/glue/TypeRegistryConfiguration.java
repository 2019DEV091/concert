package concertWebsite.glue;

import static java.util.Locale.ENGLISH;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import concertWebsite.model.Airport;
import concertWebsite.model.Concert;
import concertWebsite.model.GeoLocation;
import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import io.cucumber.cucumberexpressions.ParameterType;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableCellTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.TableRowTransformer;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

public class TypeRegistryConfiguration implements TypeRegistryConfigurer {

	@Override
	public Locale locale() {
		return ENGLISH;
	}

	@Override
	public void configureTypeRegistry(TypeRegistry typeRegistry) {


		typeRegistry.defineParameterType(
				new ParameterType<Integer>("digit", "[0-9]", Integer.class, (String s) -> Integer.parseInt(s)));

		
		typeRegistry.defineDataTableType(new DataTableType(Airport.class, new TableCellTransformer<Airport>() {

			@Override
			public Airport transform(String cell) throws Throwable {
				
				return new Airport(cell);
			}
		}));
		
		
		
		typeRegistry.defineDataTableType(new DataTableType(GeoLocation.class, new TableRowTransformer<GeoLocation>() {

			@Override
			public GeoLocation transform(List<String> row) throws Throwable {
				GeoLocation geoLocation = new GeoLocation(row.get(0),row.get(1));
				return geoLocation;
			}
		}));
		
		
		
		
		typeRegistry.defineDataTableType(new DataTableType(Concert.class, new TableEntryTransformer<Concert>() {

			@Override
			public Concert transform(Map<String, String> entry) throws Throwable {

				Map<String, String> concertValues = entry;
				String concertName = concertValues.get("concertName");
				String artistName = concertValues.get("artistName");
				String venueName = concertValues.get("venueName");
				String concertDate = concertValues.get("concertDate");
				String concertTime = concertValues.get("concertTime");
				return new Concert(concertName, artistName, venueName, concertDate, concertTime);
			}

		}));
		Transformer transformer = new Transformer();
		typeRegistry.setDefaultDataTableCellTransformer(transformer);
		typeRegistry.setDefaultDataTableEntryTransformer(transformer);
		typeRegistry.setDefaultParameterTransformer(transformer);
	}

	private class Transformer
			implements ParameterByTypeTransformer, TableEntryByTypeTransformer, TableCellByTypeTransformer {
		ObjectMapper objectMapper = new ObjectMapper();

		@Override
		public Object transform(String s, Type type) {
			return objectMapper.convertValue(s, objectMapper.constructType(type));
		}

		@Override
		public <T> T transform(Map<String, String> map, Class<T> aClass,
				TableCellByTypeTransformer tableCellByTypeTransformer) {
			return objectMapper.convertValue(map, aClass);
		}

		@Override
		public <T> T transform(String s, Class<T> aClass) {
			return objectMapper.convertValue(s, aClass);
		}
	}

}
