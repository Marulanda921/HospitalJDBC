package Database;

import java.util.List;

public interface CRUD {

        public Object create(Object object);
        public List<Object> read();
        public void update(Object object);
        public void delete(Object object);



}
