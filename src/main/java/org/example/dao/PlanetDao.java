package org.example.dao;

import org.example.entity.Planet;

import java.util.List;

public interface PlanetDao {
    boolean createPlanet(Planet planet);

    boolean updatePlanet(Planet planet);

    Planet getPlanetById(Long planetId);

    List<Planet> getAllPlanets();

    void deletePlanetById(Long planetId);

    void deletePlanet(Planet planet);
}
