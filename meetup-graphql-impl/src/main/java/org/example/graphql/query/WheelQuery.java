package org.example.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.example.graphql.model.Wheel;
import org.example.graphql.service.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WheelQuery implements GraphQLQueryResolver {

    private final WheelService wheelService;

    @Autowired
    public WheelQuery(WheelService wheelService) {
        this.wheelService = wheelService;
    }

    public List<Wheel> findAllWheels() {
        return wheelService.findAllWheels();
    }

    public Integer countWheels() {
        return wheelService.countAllWheels();
    }
}
