package com.sda.javagda17.mikroblog.service;

import com.sda.javagda17.mikroblog.mapper.WpisMapper;
import com.sda.javagda17.mikroblog.model.Wpis;
import com.sda.javagda17.mikroblog.model.WpisDto.WpisDto;
import com.sda.javagda17.mikroblog.repository.WpisRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Level;

@Log
@Service
public class WpisService {

    @Autowired
    private WpisRepository wpisRepository;

    @Autowired
    private WpisMapper wpisMapper;

    public Optional<Wpis> addWpis(WpisDto wpisDto) {
        Wpis wpis = wpisMapper.wpisDtoTowpis(wpisDto);

        try {
            return Optional.of(wpisRepository.save(wpis));
        } catch (Exception e) {
            log.log(Level.SEVERE, "Nie udało się dodać wpisu.");
        }
        return Optional.empty();
    }
}
