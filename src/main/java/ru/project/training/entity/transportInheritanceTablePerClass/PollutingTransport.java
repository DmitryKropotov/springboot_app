package ru.project.training.entity.transportInheritanceTablePerClass;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class PollutingTransport extends Transport {
    private int pollutionRating;
}
