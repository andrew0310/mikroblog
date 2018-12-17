package com.sda.javagda17.mikroblog.mapper;

import com.sda.javagda17.mikroblog.model.Wpis;
import com.sda.javagda17.mikroblog.model.WpisDto.WpisDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface WpisMapper {

    @Mappings(value = {
            @Mapping(target = "id", source = "wpisId"),
            @Mapping(target = "tresc", source = "wpisTresc")
    })
    Wpis wpisDtoTowpis (WpisDto dto);

    @Mappings(value = {
            @Mapping(source = "id", target = "wpisId"),
            @Mapping(source = "tresc", target = "wpisTresc")
    })
    WpisDto wpisToWpisDto (Wpis wpis);
}
