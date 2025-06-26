package com.eric6166.channelsync.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ChannelSyncController {

    private static final Logger log = LoggerFactory.getLogger(ChannelSyncController.class);

    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        log.info("ping");
        return ResponseEntity.ok("pong channel-sync-service-01");
    }
}
