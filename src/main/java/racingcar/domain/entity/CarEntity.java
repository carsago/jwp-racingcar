package racingcar.domain.entity;

import java.util.Objects;

public class CarEntity {

    private Integer id;
    private Integer gameId;
    private final String name;
    private final Integer position;
    private final Boolean isWin;

    public CarEntity(String name, Integer position, Boolean isWin) {
        this(null, null, name, position, isWin);
    }

    public CarEntity(Integer id, Integer gameId, String name, Integer position, Boolean isWin) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.position = position;
        this.isWin = isWin;
    }

    public Integer getId() {
        return id;
    }

    public Integer getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }

    public Boolean isWin() {
        return isWin;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        CarEntity otherCarEntity = (CarEntity) other;

        if (id == null || otherCarEntity.id == null) {
            return false;
        }

        return Objects.equals(gameId, otherCarEntity.gameId) &&
                Objects.equals(name, otherCarEntity.name) &&
                Objects.equals(position, otherCarEntity.position) &&
                Objects.equals(isWin, otherCarEntity.isWin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gameId, name, position, isWin);
    }
}
