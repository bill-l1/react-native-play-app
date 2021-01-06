import React from 'react';
import { AppRegistry, StyleSheet, View } from 'react-native';
import Home from './home';
import Header from './header';

const App = (props) => {
    return (
      <View style={styles.appContainer}>
        <Header title="Random People" />
        <Home />
      </View>
    );
}

const styles = StyleSheet.create({
  appContainer: {
    flex: 1,
  },
});

AppRegistry.registerComponent('App', App);

export default App;
