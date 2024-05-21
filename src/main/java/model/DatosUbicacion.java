package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosUbicacion(
        @JsonAlias("name") String localidad,
        @JsonAlias("country") String pais
) {
}
