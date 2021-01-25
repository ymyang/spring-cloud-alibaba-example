package com.ymyang.config;

import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerResponse;
import org.springframework.web.server.ServerWebExchange;

import static org.springframework.web.reactive.function.BodyInserters.fromValue;

@Slf4j
@Configuration
public class MySCGConfiguration {

	@Bean
	public BlockRequestHandler blockRequestHandler() {
		return new BlockRequestHandler() {
			@Override
			public Mono<ServerResponse> handleRequest(ServerWebExchange exchange, Throwable ex) {
				log.warn("blocked: " + exchange.getRequest().getURI());
				// Too Many Requests
				return ServerResponse.status(429).contentType(MediaType.APPLICATION_JSON)
						.body(fromValue("SCS Sentinel block"));
			}
		};
	}

}
