package com.example.runnerzApp.run;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles
){}


