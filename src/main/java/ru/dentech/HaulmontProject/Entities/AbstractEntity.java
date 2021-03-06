package ru.dentech.HaulmontProject.Entities;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

    @MappedSuperclass
    @Data
public class AbstractEntity implements Serializable {


        @Id
        @GeneratedValue
        private Long id;

        @Override
        public int hashCode(){
            if (getId() != null)
                return getId().hashCode();

            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            AbstractEntity other = (AbstractEntity) obj;
            if (getId() == null || other.getId() == null) {
                return false;
            }
            return getId().equals(other.getId());
        }
}
