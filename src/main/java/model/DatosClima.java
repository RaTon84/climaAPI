package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosClima(
        //@JsonAlias("name") String localidad,
        //@JsonAlias("country") String pais

) {
}
