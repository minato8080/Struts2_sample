package model;

import java.util.Arrays;
import java.util.List;

/**
 * @author A-pZ
 *
 */
public class ProductService {
    public List<SampleProduct> search() {
        List<SampleProduct> resultList =

        Arrays.asList(
            new SampleProduct("A-1", "試作品X-290PA1", 10, true, true,100),
            new SampleProduct("A-2", "試作品X-290PA2", 20, true, true,200),
            new SampleProduct("B-3", "試作品X-B3", 10, true, true,156),
            new SampleProduct("B-4", "試作品X-B4", 30, true, true,984),
            new SampleProduct("C-5", "試作品X-C5", 10, true, false,214),
            new SampleProduct("C-6", "試作品X-C6", 40, true, false,54),
            new SampleProduct("D-7", "試作品X-D7", 10, false, true,464),
            new SampleProduct("D-8", "試作品X-D8", 50, false, true,987),
            new SampleProduct("E-9", "試作品X-E9", 10, true, true,2200),
            new SampleProduct("A-10", "試作品X-290PA1", 10, true, true,546),
            new SampleProduct("A-1", "試作品X-290PA1", 10, true, true,100),
            new SampleProduct("A-2", "試作品X-290PA2", 20, true, true,200),
            new SampleProduct("B-3", "試作品X-B3", 10, true, true,156),
            new SampleProduct("B-4", "試作品X-B4", 30, true, true,984),
            new SampleProduct("C-5", "試作品X-C5", 10, true, false,214),
            new SampleProduct("C-6", "試作品X-C6", 40, true, false,54),
            new SampleProduct("D-7", "試作品X-D7", 10, false, true,464),
            new SampleProduct("D-8", "試作品X-D8", 50, false, true,987),
            new SampleProduct("E-9", "試作品X-E9", 10, true, true,2200)
        );

        return resultList;
    }
}
