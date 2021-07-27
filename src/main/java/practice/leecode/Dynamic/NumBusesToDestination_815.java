package practice.leecode.Dynamic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumBusesToDestination_815 {

    private Map<Integer, Set<Integer>> optionRoutes;
    private Map<Integer, Set<Integer>> sourceRoutes = new HashMap<>();
    private Map<Integer, Set<Integer>> targetRoutes = new HashMap<>();

    private Map<Integer, Set<Integer>> getRoutes(Set<Integer> sites, Map<Integer, Set<Integer>> routes) {
        return routes.entrySet().stream().filter(entry -> sites.stream().filter(site -> entry.getValue().contains(site)).count() > 0).collect(Collectors.toConcurrentMap(Map.Entry::getKey, Map.Entry::getValue));
        //return routes.stream().filter(route -> sites.stream().filter(site -> route.contains(site)).count() > 0).collect(Collectors.toSet());
    }

    private boolean isArrival(Set<Set<Integer>> sourceRoutes, Set<Set<Integer>> targetRoutes) {
        if (sourceRoutes.size() == 0 || targetRoutes.size() == 0) {
            return false;
        }
        Set<Integer> sourceSites = sourceRoutes.stream().flatMap(route -> route.stream()).collect(Collectors.toSet());
        Set<Integer> targetSites = targetRoutes.stream().flatMap(route -> route.stream()).collect(Collectors.toSet());
        return sourceSites.stream().filter(site -> targetSites.contains(site)).count() > 0;
    }

    public int numBusesToDestination(int[][] routes, int source, int target) {
        for (int i = 0; i < routes.length; i++) {
            boolean isSource = false;
            boolean isTarget = false;
            for (int j = 0; j < routes[i].length; j++) {
                if (source == routes[i][j]) {
                    isSource = true;
                }
                if (target == routes[i][j]) {
                    isTarget = false;
                }
            }
            if (isSource && isTarget) {
                return 1;
            }
        }

        this.optionRoutes = Stream.iterate(0, i -> i + 1).limit(routes.length)
            .collect(Collectors.toConcurrentMap(n -> n, n -> Arrays.stream(routes[n]).boxed().collect(Collectors.toSet())));

        int min = -1;

        Set<Integer> sources = new HashSet<>();
        sources.add(source);

        Set<Integer> targets = new HashSet<>();
        targets.add(target);

        //Set<Integer> options = Stream.iterate(0, i -> i + 1).limit(routes.length).collect(Collectors.toSet());

        //Set<Set<Integer>> optionRoutes = Arrays.stream(routes).map(route -> Arrays.stream(route).boxed().collect(Collectors.toSet())).collect(Collectors.toSet());

        while (optionRoutes.size() > 0) {

            //Set<Set<Integer>> sourceRoutes = getRoutes(sources, optionRoutes);
            //Set<Set<Integer>> targetRoutes = getRoutes(targets, optionRoutes);

//            if (isArrival(sourceRoutes, targetRoutes)) {
//                return min + 1;
//            }
        }

        return min;


//        List<Integer> source_routes = new ArrayList<>();
//        List<Integer> target_routes = new ArrayList<>();
//
//        for (int i = 0; i < routes.length; i++) {
//            for (int j = 0; j < routes[i].length; j++) {
//                if (source == routes[i][j]) {
//                    source_routes.add(i);
//                }
//                if (target == routes[i][j]) {
//                    target_routes.add(i);
//                }
//            }
//        }
//
//        if (source_routes.size() == 0 || target_routes.size() == 0) {
//            return -1;
//        }
//
//        List<Integer> retail_routes = source_routes.stream().filter(route -> target_routes.contains(route)).collect(Collectors.toList());
//        if (retail_routes.size() > 0) {
//            return 1;
//        }
//
//        List<Integer> transfer_routes = Stream.iterate(0, i -> i + 1).limit(routes.length - 1)
//            .filter(num -> !source_routes.contains(num) && !target_routes.contains(num)).collect(Collectors.toList());
//
//        int min = Integer.MAX_VALUE;
//        boolean arrival = false;
//
//        while (arrival == false || transfer_routes.size() == 0) {
//
//            List<Integer> prev = new ArrayList<>();
//            for (transfer_routes)
//
//
//
//            List<Integer> next = source_routes;
//
//        }
//        return min;
//
//        Set<Integer>  target_routes.stream().map(index -> Arrays.stream(routes[index]).boxed()).collect(Collectors.toSet());
//
//        Set<Integer> able_points = new HashSet<>();
//        for (Integer route_index : target_routes) {
//            int[] target_route = routes[route_index];
//            able_points
//        }



    }

}
