package racingcar.dao;

import java.util.List;
import racingcar.domain.entity.RacingGameEntity;

public interface RacingGameDao {

    int save(int count);

    List<RacingGameEntity> findAll();
}
