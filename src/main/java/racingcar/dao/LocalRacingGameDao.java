package racingcar.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import racingcar.domain.entity.RacingGameEntity;

public class LocalRacingGameDao implements RacingGameDao {

    Map<Integer, RacingGameEntity> localDb = new HashMap<>();
    private int id = 1;


    @Override
    public int save(final int count) {
        localDb.put(id, new RacingGameEntity(id, count, LocalDateTime.now()));
        return id++;
    }

    @Override
    public List<RacingGameEntity> findAll() {
        return new ArrayList<>(localDb.values());
    }
}
