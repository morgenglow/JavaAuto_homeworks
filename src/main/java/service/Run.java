package service;

import model.participant.Participant;

public interface Run {
    boolean pleaseRun(Participant participant, int length);
}