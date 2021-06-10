package org.health;

import java.util.Date;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
@ApplicationScoped
public class LivenessCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {
		// TODO Auto-generated method stub
		return HealthCheckResponse.builder()
				.name("Quarkus server")
				.up()
				.withData("mavenPlugin","1.3.0")
				.withData("systemTime", new Date().getTime())
		.build();
	}

}
