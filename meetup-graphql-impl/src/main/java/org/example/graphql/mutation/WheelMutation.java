package org.example.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.example.graphql.model.Wheel;
import org.example.graphql.service.WheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WheelMutation implements GraphQLMutationResolver {

    private final WheelService wheelService;

    @Autowired
    public WheelMutation(WheelService wheelService) {
        this.wheelService = wheelService;
    }

    public Wheel createWheel(final boolean isForWinter, final String maker, final int vehicleId) {
        return wheelService.createWheel(isForWinter, maker, vehicleId);
    }

    public boolean deleteWheel(final int id) {
        return wheelService.deleteWheel(id);
    }
}
