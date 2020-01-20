/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package sorting;

import spock.lang.Specification;

class StringSorterTest extends Specification {
    StringSorter sorter = new StringSorter()
    def strings = ['this', 'is', 'a', 'list', 'of', 'strings']
    
    def "lexicographical sort returns alphabetical"() {
        when:
        sorter.sortLexicographically strings
        
        then:
        strings == ['a','is','list','of','strings','this']
    }
    
    def "reverse sort by length should be decreasing size"() {
        when:
        sorter.sortByDecreasingLength strings
        
        then:
        strings*.size() == [7, 4, 4, 2, 2, 1]
    }
}
