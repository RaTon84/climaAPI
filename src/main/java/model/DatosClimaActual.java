package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosClimaActual(
        @JsonAlias("last_updated") String fecha,
        @JsonAlias("temp_c") String temperatura,
        @JsonAlias("wind_kph") Double viento,
        @JsonAlias("wind_dir") String vientoDireccion
) {
}
