import React from 'react';

import { NavigationContainer } from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';

const Stack = createStackNavigator();

const router = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator>
        <Stack name="Login" />
      </Stack.Navigator>
    </NavigationContainer>
  )
}

export default router;