package info.bitrich.xchangestream.gateio.config;

import com.fasterxml.jackson.databind.util.StdConverter;
import java.time.Instant;

/**
 * Converts timestamp in seconds to {@code Instant}
 */
public class TimestampSecondsToInstantConverter extends StdConverter<Long, Instant> {

  @Override
  public Instant convert(final Long value) {
    return Instant.ofEpochSecond(value);
  }
}
