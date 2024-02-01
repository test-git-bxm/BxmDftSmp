package bxm.dft.smp.online.test;

import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.json.JsonMapper;

import bxm.dft.smp.online.service.dto.SSMP1001A001OutDto;

public class JsonTest {
	private final Logger logger = LoggerFactory.getLogger(JsonTest.class);
	
	@Test
	public void jsonTest() throws Exception {
		SSMP1001A001OutDto data = new SSMP1001A001OutDto();
		data.setFeduEmpNm("Name");
		data.setFeduDeptNo(10);
		data.setFeduPayAmt(111222333444555L);
		logger.debug("Data [{}]", data);
		
		JsonGenerator generator = null;
		JsonParser parser = null;
		try {
			ObjectMapper mapper = JsonMapper.builder()
					.configure(SerializationFeature.INDENT_OUTPUT, true)
					.configure(JsonWriteFeature.WRITE_NUMBERS_AS_STRINGS, true)
					.build();
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			
			generator = mapper.getFactory().createGenerator(bout);
			generator.writeObject(data);
			generator.flush();
			
			String json = new String(bout.toByteArray());
			logger.debug("json [{}]", json);
			
			mapper = JsonMapper.builder()
					.configure(SerializationFeature.INDENT_OUTPUT, true)
//					.configure(JsonWriteFeature.WRITE_NUMBERS_AS_STRINGS, true)
					.build();
			parser = mapper.getFactory().createParser(json.getBytes());
			SSMP1001A001OutDto data2 = parser.readValueAs(SSMP1001A001OutDto.class);
			logger.debug("Data2 [{}]", data2);
		} finally {
			if(generator != null) generator.close();
			if(parser != null) parser.close();
		}
		

	}
}
