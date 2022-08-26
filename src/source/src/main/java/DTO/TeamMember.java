package DTO;

import lombok.Data;

@Data
public class TeamMember<T> {
    private T member;
}
